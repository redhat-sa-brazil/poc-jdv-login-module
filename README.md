<h1>POC-JDV-LOGIN-MODULE</h1>
<p>&nbsp;</p>
<h2>GOAL</h2>
<p><br />The goal of building this module is to be able to integrate Jboss EAP-based products into a password vault model that is agnostic to the java model. In this scenario the proposed password vault is made available by a provider that delivers the passwords to OAuth2.</p>
<p>&nbsp;</p>
<h2>Procedure</h2>
<h3>Create the directory tree</h3>
<pre><code>cd $JBOSS_HOME
mkdir -p modules</code><span class="s1">/br/com/redhat/senhasegura/main</span></pre>
<h3>&nbsp;</h3>
<h3>Create a module.xml&nbsp;</h3>
<p>&lt;module xmlns="urn:jboss:module:1.1" name="com.redhat.senhasegura"&gt;<br /> &lt;resources&gt;<br /> &lt;resource-root path="jdv-senhasegura.jar"/&gt;<br /> &lt;/resources&gt;<br /> &lt;dependencies&gt;</p>
<p>&lt;module name="javax.api"/&gt;<br /> &lt;module name="javax.persistence.api"/&gt;<br /> &lt;module name="javax.resource.api"/&gt;<br /> &lt;module name="javax.security.auth.message.api"/&gt;<br /> &lt;module name="javax.security.jacc.api"/&gt;<br /> &lt;module name="javax.servlet.api"/&gt;<br /> &lt;module name="javax.transaction.api"/&gt;<br /> &lt;module name="javax.xml.bind.api"/&gt;<br /> &lt;module name="javax.xml.stream.api"/&gt;<br /> &lt;module name="org.jboss.logging"/&gt;<br /> &lt;module name="org.infinispan"/&gt;<br /> &lt;module name="org.picketbox"/&gt;</p>
<p>&lt;/dependencies&gt;<br />&lt;/module&gt;</p>
<h3>&nbsp;</h3>
<h3>Configure the security domain to use the custom login module (standalone or domain)</h3>
<p>&lt;subsystem xmlns="urn:jboss:domain:security:1.2"&gt;<br /> &lt;security-domains&gt;<br /> &lt;security-domain name="jmx-console" cache-type="default"&gt;<br /> &lt;authentication&gt;<br /> &lt;!-- FIXME: notice the 'module' attribute --&gt;<br /> &lt;login-module module="org.jboss.example" code="com.redhat.senhasegura.CustomLoginModule" flag="required"/&gt;<br /> &lt;/authentication&gt;<br /> &lt;/security-domain&gt;<br /> &lt;/security-domains&gt;<br /> &lt;/subsystem&gt;</p>
<p>&nbsp;</p>
<h3>configuring data source with jboss-cli for use in vdb</h3>
<p>/subsystem=datasources/data-source=mysql-ds:add(jndi-name=java:/MysqlDS, driver-name=mysql8.jar, connection-url=jdbc:mysql://${SENHASEGURA_HOSTNAME}:${SENHASEGURA_PORT}/test,user-name=${SENHASEGURA_USERNAME}, password=${SENHASEGURA_PASSWORD}) <br />/subsystem=datasources/data-source=mysql-ds:enable</p>
<h3>Deploy module</h3>
<p>mvn package</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<h2>Bibliography</h2>
<p><a href="https://access.redhat.com/solutions/300903">https://access.redhat.com/solutions/300903</a></p>
<p><a href="https://access.redhat.com/solutions/129843">https://access.redhat.com/solutions/129843</a></p>
<p><a href="https://access.redhat.com/documentation/en-us/red_hat_jboss_enterprise_application_platform/6.4/html-single/development_guide/index#sect-Custom_Modules">https://access.redhat.com/documentation/en-us/red_hat_jboss_enterprise_application_platform/6.4/html-single/development_guide/index#sect-Custom_Modules</a><a href="https://access.redhat.com/solutions/129843">https://access.redhat.com/solutions/129843</a></p>
<p><a href="https://access.redhat.com/documentation/en-us/red_hat_jboss_data_virtualization/6.3/html/administration_and_configuration_guide/sect-data_source_deployment#sect-JDBC_Data_Sources">https://access.redhat.com/documentation/en-us/red_hat_jboss_data_virtualization/6.3/html/administration_and_configuration_guide/sect-data_source_deployment#sect-JDBC_Data_Sources</a></p>
<p>&nbsp;</p>
<div align="left">&nbsp;</div>
<div align="left"><a href="https://travis-ci.org/{{gpas}{repo-owner-username}}/{gpas}{repo-name}}"> <img src="https://img.shields.io/travis/{{gpas}{repo-owner-username}}/{{gpas}{repo-name}}/master.svg?style=flat-square" alt="Travis Status" /> </a></div>
