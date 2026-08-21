# AC System - Builder Design Pattern

## Overview

This project uses the **Builder Design Pattern** to construct `AC` (Air Conditioner) objects with multiple, complex
specifications, instead of relying on a traditional constructor.

## What the Code Does

The code builds different types of AC objects (Split AC, Window AC) step by step using dedicated builder classes. Each
Concrete Builder sets the required properties (Capacity, Compressor Type, Refrigerant, Filter Type, Display Type, Smart
Features) one at a time, while the Director controls the order of these steps. The final `build()` call returns a fully
configured, ready-to-use AC object.

## The Problem

The `AC` object has a large number of properties:
- Capacity - Compressor Type

- Refrigerant
- Filter Type
- Display Type
- Smart Features

There is also more than one type of AC (Split AC, Window AC), and each type has different values for these properties.

    Using a regular constructor to create these objects leads to a well-known problem called **Constructor Hell / Telescoping Constructor Problem**:

- Hard to read code (`new AC(1.5, "Rotary", "R32", "HEPA", "Digital", true)`)
- Easy to make mistakes due to parameter order
- Multiple constructor overloads needed to cover partial cases
- Difficult to add new properties in the future

## The Solution: Builder Pattern

The object is built step by step using clearly named methods:

    ```java

AC ac = builder .setCapacity (1.5)
.setCompressorType ("Rotary")
.setRefrigerant ("R32")
.setFilterType ("HEPA")
.setDisplayType ("Digital")
.setSmartFeatures (true)
.build ();

```

### Pattern Components in the Project
| Component | Role |
|---|---|
| `AC` | The resulting object (Product) |
| `ACBuilder` (Interface) | Defines the general building steps |
| `SplitACBuilder` | Concrete Builder responsible for building a Split AC |
| `WindowACBuilder` | Concrete Builder responsible for building a Window AC |
| `Director` | Orchestrates the building steps without knowing implementation details |

## Why Builder and Not Other Patterns?

| Pattern | Why It Wasn't Chosen |
|---|---|
| **Factory Method** | Good for creating different objects, but doesn't support step-by-step construction |
| **Singleton** | Ensures only one instance exists, while we need multiple AC objects with different specs |

## Benefits
- Cleaner, more readable code
- Easy to add new AC types (e.g., Portable AC) without modifying existing code → **Open/Closed Principle**
- Flexible construction of objects with partial or full specifications
- Separates building logic (Builder) from ordering logic (Director)