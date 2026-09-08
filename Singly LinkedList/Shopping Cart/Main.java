// PRODUCT CLASS

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    public Product(int productId,
                   String productName,
                   double price,
                   int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
}


// NODE CLASS

class Node {

    Product product;
    Node next;

    public Node(Product product) {

        this.product = product;
        this.next = null;
    }
}


// LINKED PRODUCT CLASS

class LinkedProduct {

    Node head;
    Node tail;
    int size;


    // CONSTRUCTOR

    LinkedProduct() {

        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    // ADD AT FRONT

    void addProductFront(Product product) {

        Node addProduct = new Node(product);

        if (head == null) {

            head = addProduct;
            tail = addProduct;

        } else {

            addProduct.next = head;
            head = addProduct;
        }

        size++;
    }


    // ADD AT BACK

    void addProductBack(Product product) {

        Node addBackProduct = new Node(product);

        if (head == null) {

            head = addBackProduct;
            tail = addBackProduct;

        } else {

            tail.next = addBackProduct;
            tail = addBackProduct;
        }

        size++;
    }


    // REMOVE PRODUCT

    void removeProduct(int productId) {

        if (head == null) {

            System.out.println("List is Empty");
            return;
        }


        // DELETE FIRST NODE

        if (head.product.productId == productId) {

            if (head == tail) {

                head = null;
                tail = null;

            } else {

                head = head.next;
            }

            size--;
            return;
        }


        Node current = head;


        // DELETE FROM MIDDLE OR LAST

        while (current.next != null) {

            if (current.next.product.productId == productId) {

                if (current.next == tail) {

                    tail = current;
                }

                current.next = current.next.next;

                size--;
                return;
            }

            current = current.next;
        }


        System.out.println("Product not found");
    }


    // SEARCH PRODUCT

    void searchProduct(int productId) {

        if (head == null) {

            System.out.println("List is Empty");
            return;
        }

        boolean found = false;

        Node current = head;

        while (current != null) {

            if (current.product.productId == productId) {

                found = true;
                break;
            }

            current = current.next;
        }


        if (!found) {

            System.out.println("Product Not Found");

        } else {

            System.out.println("Product Found");
        }
    }


    // UPDATE QUANTITY

    void updateQuantity(int productId, int quantity) {

        if (head == null) {

            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {

            if (current.product.productId == productId) {

                current.product.quantity = quantity;
                return;
            }

            current = current.next;
        }

        System.out.println("Product Not Found");
    }


    // CALCULATE TOTAL PRICE

    void calculateTotal() {

        if (head == null) {

            System.out.println("List is Empty");
            return;
        }

        double costPrice = 0;

        Node current = head;

        while (current != null) {

            costPrice += current.product.price *
                         current.product.quantity;

            current = current.next;
        }

        System.out.println("Total Price: " + costPrice);
    }


    // DISPLAY ALL PRODUCTS

    void displayCart() {

        if (head == null) {

            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {

            System.out.println("--------------------");

            System.out.println("Product ID: "
                    + current.product.productId);

            System.out.println("Product Name: "
                    + current.product.productName);

            System.out.println("Price: "
                    + current.product.price);

            System.out.println("Quantity: "
                    + current.product.quantity);

            current = current.next;
        }

        System.out.println("--------------------");
    }


    // INCREASE QUANTITY

    void increaseQuantity(int productId, int amount) {

        if (head == null) {

            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {

            if (current.product.productId == productId) {

                current.product.quantity =
                        current.product.quantity + amount;

                return;
            }

            current = current.next;
        }

        System.out.println("Product Not Found");
    }


    // DECREASE QUANTITY

    void decreaseQuantity(int productId, int amount) {

        if (head == null) {

            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {

            if (current.product.productId == productId) {

                current.product.quantity =
                        current.product.quantity - amount;


                // QUANTITY MUST NOT BECOME NEGATIVE

                if (current.product.quantity < 0) {

                    current.product.quantity = 0;
                }

                return;
            }

            current = current.next;
        }

        System.out.println("Product Not Found");
    }


    // SIZE

    int size() {

        return size;
    }


    // CLEAR CART

    void clearCart() {

        head = null;
        tail = null;
        size = 0;
    }


    // CALCULATE TOTAL INDIVIDUAL ITEMS

    int calculateTotalItems() {

        int totalItems = 0;

        Node current = head;

        while (current != null) {

            totalItems += current.product.quantity;

            current = current.next;
        }

        return totalItems;
    }


    // FIND MOST EXPENSIVE PRODUCT

    Product findMostExpensiveProduct() {

        if (head == null) {

            return null;
        }

        Product expensive = head.product;

        Node current = head.next;

        while (current != null) {

            if (current.product.price > expensive.price) {

                expensive = current.product;
            }

            current = current.next;
        }

        return expensive;
    }


    // CALCULATE PRODUCT COST

    double calculateProductCost(int productId) {

        Node current = head;

        while (current != null) {

            if (current.product.productId == productId) {

                return current.product.price *
                       current.product.quantity;
            }

            current = current.next;
        }

        return 0;
    }
}



// MAIN CLASS

public class Main {

    public static void main(String[] args) {

        LinkedProduct product = new LinkedProduct();


        // ADD AT FRONT

        product.addProductFront(
                new Product(1, "Oil", 340.5, 2)
        );


        // ADD AT BACK

        product.addProductBack(
                new Product(2, "Tomato", 120, 2)
        );


        // ADD ANOTHER PRODUCT

        product.addProductBack(
                new Product(3, "Milk", 250, 3)
        );


        // DISPLAY CART

        System.out.println("===== CART =====");

        product.displayCart();


        // SEARCH PRODUCT

        System.out.println("\n===== SEARCH =====");

        product.searchProduct(2);


        // SIZE

        System.out.println("\n===== SIZE =====");

        System.out.println("Number of Products: "
                + product.size());


        // TOTAL INDIVIDUAL ITEMS

        System.out.println("\n===== TOTAL ITEMS =====");

        System.out.println("Total Items: "
                + product.calculateTotalItems());


        // INCREASE QUANTITY

        System.out.println("\n===== INCREASE QUANTITY =====");

        product.increaseQuantity(1, 3);

        product.displayCart();


        // DECREASE QUANTITY

        System.out.println("\n===== DECREASE QUANTITY =====");

        product.decreaseQuantity(2, 1);

        product.displayCart();


        // UPDATE QUANTITY

        System.out.println("\n===== UPDATE QUANTITY =====");

        product.updateQuantity(3, 10);

        product.displayCart();


        // CALCULATE TOTAL PRICE

        System.out.println("\n===== TOTAL PRICE =====");

        product.calculateTotal();


        // CALCULATE PRODUCT COST

        System.out.println("\n===== PRODUCT COST =====");

        System.out.println("Product 1 Cost: "
                + product.calculateProductCost(1));


        // MOST EXPENSIVE PRODUCT

        System.out.println("\n===== MOST EXPENSIVE =====");

        Product expensive =
                product.findMostExpensiveProduct();

        if (expensive != null) {

            System.out.println("Product ID: "
                    + expensive.productId);

            System.out.println("Product Name: "
                    + expensive.productName);

            System.out.println("Price: "
                    + expensive.price);
        }


        // REMOVE PRODUCT

        System.out.println("\n===== REMOVE PRODUCT =====");

        product.removeProduct(2);

        product.displayCart();

        System.out.println("Size after deletion: "
                + product.size());


        // CLEAR CART

        System.out.println("\n===== CLEAR CART =====");

        product.clearCart();

        System.out.println("Size after clearing: "
                + product.size());

        product.displayCart();
    }
}
