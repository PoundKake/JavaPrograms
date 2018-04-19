JC = javac
.SUFFIXES: .java .class

.java.class:
	$(JC) $*.java

CLASSES = \
	PongGameProg.java \
	PongBall.java \
	RightPaddle.java \
	LeftPaddle.java \
	PongPanel.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm *.class
