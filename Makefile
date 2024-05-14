# Makefile to wrap Gradle commands using the Gradle Wrapper

.PHONY: all clean build test

# Set 'clean build' as the default target
default: clean build

clean:
	./gradlew clean

build:
	./gradlew build --warning-mode all

test:
	./gradlew test

# You can add more custom commands as needed, for example:
deploy:
	./gradlew deploy

# If you want to pass any custom arguments to Gradle, you can define a command like:
custom:
	./gradlew $(CMD)
