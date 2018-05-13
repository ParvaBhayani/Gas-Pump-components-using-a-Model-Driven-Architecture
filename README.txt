Software Systems Architectures
Design pattern requirement indications
1	State Pattern (De-centralized)
	-Implemented in package “States" of the GasPump Module
	-State is the abstract State superclass
	-Start, S0, S1, S2, S3, S4, S5, S6 , S7, S8 are the State subclasses
	-State classes are responsible for performing both actions and state transitions
2	Strategy Pattern
	-Implemented in package “Output” of the GasPump Module
	-Output is the client class that needs to be initialized with proper action strategies
	-One class is the abstract strategy that groups different implementations of a specific strategy
	-The other 2 classes are GasPump-1 and GasPump-2 specific implementation for the meta-actions of the model according to specifications for their 		respective GasPump requirements.
3	Abstract Factory Pattern
	-Implemented in package "AbstractFactory" of the GasPump Module
	-Factory is the abstract superclass
	-Factory1 is the factory that returns the necessary driver objects for GasPump1
	-Factory2 is the factory that returns the necessary driver objects for GasPump2
	-The default package contains the abstract class GasPump which uses the correct poly-morphed AbstractFactory class to initialize the proper drivers		 for GasPump1 and GasPump2


The folder contains Source code , batch file, and Project Report. 


Batch file can be run directly on windows platform 

Batch file and jar file should be kept together in the folder.


To run Jar file, 
1. go to the path where jar file is present from cmd
2. type "java -jar Gaspump.jar" and enter



