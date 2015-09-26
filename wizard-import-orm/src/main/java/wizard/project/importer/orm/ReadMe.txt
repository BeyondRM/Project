  This module is for importing either part or all of an existing Open RPG Maker project.

  Open RPG Maker was intended to be an open-source "role-playing game maker" generified, written in C++ and having a Qt
user-interface. It was noticeably "crashable" due to various aspects of the implementation of Qt, especially on Windows
platforms. As of this writing, ORM seems to be somewhat stalled in development, meaning many of its editor features are
incomplete, with the somewhat vague explanation of things being completed "when the engine is implemented".

  Regardless, BeyondRM has many aspects being openly developed in a homogeneous manner. A lot of our infrastructure and
XML formats were originally created from examination of ORM's files (whatever was available, anyway) as well as simplex
perusal of RPG Maker VX Ace's database and mapping components. Anyone coming to the BeyondRM project from another maker
may expect a moderate amount of carry-over from those other editors and engines, and we aim to be able to import all or
parts of other projects, whichever is possible, into a new BeyondRM project.

  Importing data should generally use a blank project template, with little to no information pre-generated.