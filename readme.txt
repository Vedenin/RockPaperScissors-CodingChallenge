Coding Example
Task: Rock-Paper-Scissors

Build system: maven
Test system: TestNG

Pattern: Strategy, Dependency injection

Run:
1. Build project using maven
2. Run main method of Application.class (package com.github.vedenin.testtask)

Testing:
1. StrategiesTest - test all Strategies
2. RulesTest - test rule of Rock-Paper-Scissors
3. GamesTest - integration test of all project

Advantages of my design:
1. Using single responsibility principle (every class have only one task)
2. Using open/closed principle (easy for extension, almost all class has interface)
3. Dependency inversion principle (using Dependency injection framework - Guice)
4. Possible to extensions for any Two-player games (chess, checkers, go and so on)
5. Only some class has specific Rock-Paper-Scissors details (in package rockpaperscissors),
other classes can be using in any Two-player games

Disadvantages of my design:
1. Many class/interface for extensions for any Two-player games
