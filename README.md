<div align="center">
  <h1> FLYWEIGHT  </h1>
</div>

# Code

Simple project representing the flyweight design pattern. For this one, i created a Game Class that has multiple assets and textures, textures can be used in multiple assets.If 2 assets uses the same texture, intead of creating 2 texture objets, only one object for that texture is really necessary, so the texture object should be referenced in the assets without being duplicated and consume more memory.

# Resume

Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

![image](https://user-images.githubusercontent.com/40416044/148701998-2f823d0e-20a6-4872-a85a-9dcb13eccd47.png)

# What can a Facade do?

The flyweight pattern is useful when dealing with large numbers of objects with simple repeated elements that would use a large amount of memory if individually stored. It is common to hold shared data in external data structures and pass it to the objects temporarily when they are used.

A classic example are the data structures used representing characters in a word processor. Naively, each character in a document might have a glyph object containing its font outline, font metrics, and other formatting data. However, this would use hundreds or thousands of bytes of memory for each character. Instead, each character can have a reference to a glyph object shared by every instance of the same character in the document. This way, only the position of each character needs to be stored internally.

As a result, flyweight objects can

- store intrinsic state that is invariant, context-independent and shareable (for example, the code of character 'A' in a given character set)
- provide an interface for passing in extrinsic state that is variant, context-dependent and can't be shared (for example, the position of character 'A' in a text document)

Clients can reuse Flyweight objects and pass in extrinsic state as necessary, reducing the number of physically created objects.





Source: <a href="https://pt.wikipedia.org/wiki/Flyweight"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/flyweight"> Refactoring Guru </a>
