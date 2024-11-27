/**
 The Factory Pattern is a creational design pattern that provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created. It provides a way to encapsulate object creation in a separate entity, which can be used by other parts of the program without knowing the details of how the object is created.
**/

// Product Interface
interface Button {
  render(): void;
  onClick(): void;
}

// Concrete Products
class WindowsButton implements Button {
  render(): void {
    console.log("Windows Button");
  }
  onClick(): void {
    console.log("Windows Button Clicked");
  }
}

class HTMLButton implements Button {
  render(): void {
    console.log("HTML Button");
  }
  onClick(): void {
    console.log("HTML Button Clicked");
  }
}

// Creator Interface
interface Dialog {
  render(): void;
  createButton(): Button;
}

// Concrete Creators
class WindowsDialog implements Dialog {
  render(): void {
    console.log("Windows Dialog");
  }
  createButton(): Button {
    return new WindowsButton();
  }
}

class HTMLDialog implements Dialog {
  render(): void {
    console.log("HTML Dialog");
  }
  createButton(): Button {
    return new HTMLButton();
  }
}

// Client

const dialog = new WindowsDialog();
dialog.render();
dialog.createButton().onClick();

const htmlDialog = new HTMLDialog();
htmlDialog.render();
htmlDialog.createButton().onClick();

// Problem:

// Solution:

// Structure:
