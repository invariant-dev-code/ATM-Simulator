# 📚 Library Management System

A simple **Java console-based Library Management System** built for practicing **Object-Oriented Programming (OOP)** concepts such as **Encapsulation, Getters & Setters, Constructors, ArrayList, Loops, and Menu-Driven Applications**.

This project allows users to **add, search, borrow, return, show, and delete books** through a console menu system.

---

# 🚀 Features

- ➕ Add new books
- 📖 Show all books
- 📥 Borrow books
- 📤 Return books
- 🔍 Search books by title
- ❌ Delete books
- ✅ Track book availability status
- 🔒 Encapsulation using `private` fields
- 🧠 Practice Java OOP concepts

---

# 🛠️ Technologies Used

- **Java**
- **Object-Oriented Programming (OOP)**
- **ArrayList**
- **Scanner**
- **Loops & Conditions**
- **Encapsulation**
- **Constructors**
- **Getters & Setters**

---

# 📂 Project Structure

```text
LibraryManagementSystem/
│── Book.java
│── Main.java
│── README.md
```

---

# 📌 How It Works

The program provides a simple menu system in the console.

```text
===== LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. Show Books
3. Borrow Book
4. Return Book
5. Search Book
6. Delete Book
7. Exit
```

---

# 📚 Functionalities

## 1. Add Book

Users can add a new book by entering:

- Book ID
- Book Title

Example:

```text
Enter Book ID: 101
Enter Book Title: Java Programming
Book added successfully!
```

---

## 2. Show Books

Displays all books and their availability status.

Example:

```text
Book ID: 101
Book Title: Java Programming
Status: Available
----------------------
```

---

## 3. Borrow Book

Users can borrow a book using its ID.

Example:

```text
Enter Book ID to borrow: 101
Book borrowed successfully!
```

If the book is already borrowed:

```text
This book is already borrowed!
```

---

## 4. Return Book

Users can return a borrowed book.

Example:

```text
Enter Book ID to return: 101
Book returned successfully!
```

If the book is already available:

```text
This book is already available!
```

---

## 5. Search Book

Users can search for a book by title.

Example:

```text
Enter book title to search: Java Programming

Book Found:
Book ID: 101
Book Title: Java Programming
Status: Available
----------------------
```

If no matching book exists:

```text
Book not found!
```

---

## 6. Delete Book

Users can delete a book by ID.

Example:

```text
Enter Book ID to delete: 101
Book deleted successfully!
```

If the book does not exist:

```text
Book not found!
```

---

# 🧱 OOP Concepts Used

## 1. Encapsulation

The `Book` class uses `private` fields to protect data.

```java
private int id;
private String title;
private boolean borrowed;
```

Data is accessed through getters and setters.

```java
book.getId();
book.getTitle();
book.isBorrowed();
book.setBorrowed(true);
```

---

## 2. Constructor

A constructor is used to create book objects.

```java
public Book(int id, String title) {
    this.id = id;
    this.title = title;
}
```

Example:

```java
books.add(new Book(1, "Java Basics"));
```

---

## 3. ArrayList

Books are stored dynamically using an `ArrayList`.

```java
ArrayList<Book> books = new ArrayList<>();
```

---

## 4. Loops & Conditions

The project uses:

- `for-each loop`
- `switch-case`
- `if-else`

Example:

```java
for (Book book : books) {
    book.showBook();
}
```

---

# ▶️ How to Run

### 1. Compile the files

```bash
javac Book.java Main.java
```

### 2. Run the project

```bash
java Main
```

---

# 🎯 Learning Goals

This project helps beginners practice:

- Java basics
- OOP concepts
- Encapsulation
- Constructors
- Getters & Setters
- ArrayLists
- Loops
- Conditions
- Console applications
- CRUD operations

---

# 👨‍💻 Author

Developed by a Parvin Alasgar
