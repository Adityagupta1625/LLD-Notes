interface Button {
  onclick(): void;
}

class WindowsButton implements Button {
  onclick(): void {
    console.log("Windows Button Clicked");
  }
}

class MacButton implements Button {
  onclick(): void {
    console.log("Mac Button Clicked");
  }
}

interface CheckBox {
  paint(): void;
}

class WindowsCheckBox implements CheckBox {
  paint(): void {
    console.log("Windows CheckBox Painted");
  }
}

class MacCheckBox implements CheckBox {
  paint(): void {
    console.log("Mac CheckBox Painted");
  }
}

interface GUIFactory {
  createButton(): Button;
  createCheckBox(): CheckBox;
}

class WindowsFactory implements GUIFactory {
  createButton(): Button {
    return new WindowsButton();
  }
  createCheckBox(): CheckBox {
    return new WindowsCheckBox();
  }
}

class MacFactory implements GUIFactory {
  createButton(): Button {
    return new MacButton();
  }
  createCheckBox(): CheckBox {
    return new MacCheckBox();
  }
}

class Application {
  factory: GUIFactory;

  constructor(factory: GUIFactory) {
    this.factory = factory;
  }

  createUI() {
    this.factory.createButton().onclick();
    this.factory.createCheckBox().paint();
  }
}

// main code
const config = "mac";
let factory: GUIFactory | null = null;

if (config === "mac") {
  factory = new MacFactory();
} else if (config === "windows") {
  factory = new WindowsFactory();
} else {
  console.log("Invalid Configuration");
}
const app = new Application(factory as GUIFactory);
app.createUI();
