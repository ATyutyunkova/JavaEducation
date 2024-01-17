package lr7.task4;

class FirstClass {
    public char charValue;

    public FirstClass(char charValue) {
        this.charValue = charValue;
    }

    public FirstClass(FirstClass original) {
        this.charValue = original.charValue;
    }
}

class SecondClass extends FirstClass {
    public String stringValue;

    public SecondClass(char charValue, String stringValue) {
        super(charValue);
        this.stringValue = stringValue;
    }

    public SecondClass(SecondClass original) {
        super(original);
        this.stringValue = original.stringValue;
    }
}

class ThirdClass extends SecondClass {
    public int intValue;

    public ThirdClass(char charValue, String stringValue, int intValue) {
        super(charValue, stringValue);
        this.intValue = intValue;
    }

    public ThirdClass(ThirdClass original) {
        super(original);
        this.intValue = original.intValue;
    }
}
