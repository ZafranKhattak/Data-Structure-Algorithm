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

// CLASS LINKEDPRODUCT

class LinkedProduct {

    Node head;
    Node tail;

    LinkedProduct() {
        this.head = null;
        this.tail = null;
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
    }

    // ADD AT BACK
    void addProductBack(Product product) {

        Node addBackProduct = new Node(product);
        if (head == null) {
            head = addBackProduct;
            tail = addBackProduct;
            return;
        }

        Node current = head;
        while (current.next != null) {

            current = current.next;
        }
        current.next = addBackProduct;
        current = head;
    }

    // DELETE PRODUCT
    void removeProduct(int productId) {
        if (head == null) {
            System.out.print("List is Empty");
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
                return ;
            }

            current = current.next;
        }
         System.out.println("Product not found");
    }

    // SEARCH PRODUCT
    void searchProduct(int productId)
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return ;
        }

        boolean found = false;

        Node current = head;

        while(current !=null)
        {
            if(current.product.productId == productId)
            {
                found = true;
                break;
            }

            current = current.next;
        }

        if(!found)
        {
            System.out.println("Product Not Found");
        }
        else 
        {
            System.out.println("Product Found");
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
