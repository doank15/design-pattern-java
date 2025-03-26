package org.tvf.builderpattern;

public class Coffee {
    private final boolean sugar;
    private final boolean milk;
    private final String size;
    private final String type;

    private Coffee(CoffeeBuilder builder) {
        this.milk = builder.milk;
        this.sugar = builder.sugar;
        this.size = builder.size;
        this.type = builder.type;
    }


    public boolean isSugar() {
        return sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public static class CoffeeBuilder {
        private boolean sugar;
        private boolean milk;
        private String size;
        private final String type;

        public CoffeeBuilder(String type) {
            this.type = type;
        }

        public CoffeeBuilder withSugar(boolean sugar) {
            this.sugar = sugar;
            return this;
        }

        public CoffeeBuilder withMilk(boolean milk) {
            this.milk = milk;
            return this;
        }

        public CoffeeBuilder withSize(String size) {
            this.size = size;
            return this;
        }

        public Coffee build() {
            return new Coffee(this);
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Sử dụng Builder để tạo một ly cà phê mocha, có sữa, không đường, kích thước lớn
        Coffee coffee1 = new Coffee.CoffeeBuilder("mocha")
                .withMilk(true)
                .withSugar(false)
                .withSize("large")
                .build();

        // In thông tin ly cà phê
        System.out.println(coffee1);

        // Tạo một ly cà phê espresso đơn giản, mặc định không sữa, không đường, kích thước vừa
        Coffee coffee2 = new Coffee.CoffeeBuilder("espresso")
                .build();

        Coffee coffee3 = new Coffee.CoffeeBuilder("espresso").withSugar(true)
                .build();

        // In thông tin ly cà phê
        System.out.println(coffee2);
    }
}