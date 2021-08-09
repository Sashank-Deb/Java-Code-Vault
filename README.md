# Java-Code-Vault
A repository for very basic Java Programs that I had practiced in my initials years of engineering degree. 

Will be updating the repository regular as I gather more questions.

![java-eps-vector-logo](https://user-images.githubusercontent.com/69194538/128751270-3956993c-e997-4d43-8803-b97643c477e3.png)

# What is JAVA
Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented, etc. 
Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture.

`JDK(Java Development Kit)`: JDK is intended for software developers and includes development tools such as the Java compiler, Javadoc, Jar, and a debugger.
`JRE(Java Runtime Environment)`: JRE contains the parts of the Java libraries required to run Java programs and is intended for end-users. JRE can be view as a subset of JDK.
`JVM (Java Virtual Machine)`: JVM is an abstract machine. It is a specification that provides a runtime environment in which java bytecode can be executed. JVMs are available for many hardware and software platforms.

`JVM, JRE, and JDK three are all platform-dependent because the configuration of each Operating System is different. But, Java is platform-independent.` 

## Setting up the environment in Java in Windows

Steps for setting the environment in Windows operation system are as follows: 

`Step 1`: Java8 JDK is available at Download Java 8. Click the last link for Windows(64 bit) as highlighted below. 

`Step 2`: After download, run the .exe file and follow the instructions to install Java on your machine. Once you installed Java on your machine, you have to set up the environment variable.

`Step 3`: Go to Control Panel -> System and Security -> System. 
Under the Advanced System Setting option click on Environment Variables as highlighted below. 
 
`Step 4`: Now, you have to alter the “Path” variable under System variables so that it also contains the path to the Java environment. Select the “Path” variable and click on the Edit button as highlighted below. 
 
`Step 5`: You will see a list of different paths, click on the New button and then add the path where java is installed. By default, java is installed in `“C:\Program Files\Java\jdk\bin” folder OR “C:\Program Files(x86)\Java\jdk\bin”`. In case, you have installed java at any other location, then add that path. 

`Step 6`: Click on `OK`, Save the `settings`, and you are done !! Now to check whether the installation is done correctly, open the command prompt and type javac -version. You will see that java is running on your machine.
