set projectLocation=C:\Users\Convidad01\QAEnvironment\TestProject
 
cd %projectLocation%
 
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
 
java org.testng.TestNG %projectLocation%\testng.xml
 
pause