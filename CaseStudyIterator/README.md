# Iterator Design Pattern - Music Playlist Example

A beginner-friendly Java implementation of the **Iterator Design Pattern**.

## Overview
This module demonstrates the Iterator pattern using a Music Playlist. The pattern allows the main program to loop through a collection of `Song` objects sequentially using a `PlaylistIterator` without needing to understand the underlying array mechanics.

This is highly comparable to pressing the "Next" button on a music player.

## Files
All logic is contained within a single executable file:
- `Song`: The simple data object.
- `Playlist`: The collection that stores the array of songs.
- `PlaylistIterator`: The class that handles the `hasNext()` and `next()` traversal logic.
- `Main`: The test execution class.

## How to Run
1. Save the code as `Main.java`.
2. Compile the file: `javac Main.java`
3. Run the application: `java Main`
