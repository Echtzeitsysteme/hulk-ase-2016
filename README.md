# HULK - Continuous Object-Oriented Design Flaw Detection

Design flaws in object-oriented programs may seriously corrupt code 
quality thus increasing the risk for introducing subtle errors 
during software maintenance and evolution. 
Most recent approaches identify design flaws in an ad-hoc manner, either focusing on 
software metrics, locally restricted code smells, or on coarse-grained 
architectural anti-patterns.
In this paper, we utilize an abstract program model capturing high-level
object-oriented code entities, further augmented with qualitative and 
quantitative design-related information such as coupling/cohesion.
Based on this model, we propose a comprehensive methodology for specifying 
object-oriented design flaws by means 
of compound rules integrating code metrics, 
code smells and anti-patterns in a modular way. 
This approach allows for efficient, automated design-flaw detection through 
incremental multi-pattern matching, by facilitating
systematic information reuse among multiple detection rules 
as well as between subsequent detection runs on continuously evolving programs.

This site contains the source code of our tool implementation HULK which comprises well-known anti-patterns for Java programs, as well as the results of our experimental evaluation which show high detection precision, 
scalability to real-size programs, 
as well as a remarkable gain in efficiency due to information reuse.

HULK is a tool prototype to support object-oriented software development by continuously detecting design flaws over the version history. As a result, an annotated model of the program containing design flaw information is created. Moreover, the annotations also appear in the source code, effectively supporting maintenance decisions.

## Installation

TODO

## Evaluation

We evaluate HULK on an established corpus of 13 (TODO: check) open-source Java projects selected from related literature on anti-pattern and code smell detection. Sources for the corpus are:

- [Moha et al.: DECOR - A Method for the Specification and Detection of Code and Design Smells. In: Transactions on Software Engineering, vol. 36, 2010.](http://www.irisa.fr/triskell/publis/2009/Moha09d.pdf)
- [Khomh et al.: BDTEX - A GQM-based Bayesian Approach for the Detection of Antipatterns. In: Journal of Systems and Software, vol. 84, 2011.](http://dl.acm.org/citation.cfm?id=1942375)
- [Ujhelyi et al.: Anti-Pattern Detection with Model Queries: A Comparison of Approaches. In: Proceedings of CSMR-WCRE 2014.](http://publicatio.bibl.u-szeged.hu/4761/1/2498771.pdf)

Based on these papers and our own investigations for simple examples, the following projects has been selected for the evaluation corpus:

- [ArgoUML, version 0.19.8](http://argouml.tigris.org/): an open-source UML modeling tool
- [Azureus, version 2.3.0.6](http://dev.vuze.com/): an open-source BitTorrent client, now called Vuze
- [Gantt, version 1.10.2](https://sourceforge.net/projects/ganttproject/files%2FOldFiles/): an open-source project scheduling and management tool
- [JabRef, version 2.7](https://github.com/JabRef/jabref/): an open-source bibliography reference manager
- [JavaSolitaire, version 1.3](https://github.com/FBergeron/javasol): an open-source implementation of the Klondike solitaire game
- [JEdit, version 4.0](https://sourceforge.net/projects/jedit/files/jedit/4.0/): an open-source text editor
- [JSciCalc, version 2.1.0](https://sourceforge.net/projects/jscicalc/files/jscicalc/): an open-source scientific calculator
- [JTransforms, version 3.1](https://sites.google.com/site/piotrwendykier/software/jtransforms): an open-source FFT library
- [JUnit, version 3.8.2](http://repo1.maven.org/maven2/junit/junit/3.8.2/): an open-source unit testing framework
- [log4j, version 1.2.17](https://logging.apache.org/log4j/1.2/source-repository.html): an open-source logging lramework for Java
- [Lucene, version 1.4.3](http://archive.apache.org/dist/lucene/java/): an open-source indexing and search engine
- [Nutch, version 0.9](http://archive.apache.org/dist/nutch/): an open-source Web crawler
- [PMD, version 3.9](https://sourceforge.net/projects/pmd/files/pmd/3.9/): an open-source static code analyzer
- [QuickUML, version 2001](https://sourceforge.net/projects/quj/files/): an open-source, light-weight UML editor
- [SvnKit, version 1.8.12](http://svnkit.com/download.php): an open-source Subversion library
- [Xerces, version 2.7.0](http://archive.apache.org/dist/xml/xerces-j/): an open-source XML parser

All source codes can be found under TODO:separate folder
