class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    // ==================== CLASS QueueExperienceU =============
    class QueueExperience {
        Node front;
        Node rear;

        public QueueExperience() {
            this.front = null;
            this.rear = null;
        }

        // ================= ENQueueExperience METHOD ==========
        void enQueue(int value)
        {
            Node newNode = new Node(value);
            if(front == null)
            {
                front = newNode;
                rear = newNode;
            }else 
            {
                rear.next = newNode;
                rear = newNode;
            }
        }

        // ================= DEQueueExperience METHOD ==========
        int deQueue()
        {
            if(front ==null)
            {
                System.out.println("QueueExperience is Empty");
                return -1;
            }

            int value = front.data;
            front = front.next;
            if(front == null)
            {
                rear = null;
            }
            return value;
        }

        // =================== MAXIMUM METHOD ================
        int maximum()
        {
             if(front ==null)
            {
                System.out.println("QueueExperience is Empty");
                return -1;
            }

            Node current = front;
            int max = current.data;
            while(current !=null)
            {
                if(current.data > max)
                {
                    max = current.data;
                }
                current = current.next;
            }

            return  max;
        }

        // ==================== MINIMUM METHOD ================
        int minimum()
        {
            if(front == null)
            {
                System.out.println("QueueExperience is Empty");
                return -1;
            }

            Node current = front;
            int min = current.data;

            while(current !=null)
            {
                if(current.data < min)
                {
                    min = current.data;
                }
                current = current.next;
            }

            return min;
        }

        // ==================== RANGE METHOD ===================

        int range()
        {
            if(front ==null)
            {
                System.out.println("QueueExperience is Emtpy");
                return -1 ;
            }

            return maximum() - minimum();
        }

        // =================== DISPLAY METHOD ==================
        void diplay()
        {
            if(front == null)
            {
                System.out.println("QueueExperience is EMpty");
                return ;
            }

            Node current = front;
            while(current !=null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

    // ===================== MAIN CLASS ================
class Main {
   public static void main(String[] args) {
    
      int experience [] = {1,4,0,5,6,7,8,15,10,11,12,17};

      QueueExperience junior = new QueueExperience();
      QueueExperience midLevel = new QueueExperience();
      QueueExperience senior = new QueueExperience();

      for (int exp : experience)
      {
         if(exp >= 10)
         {
            senior.enQueue(exp);
         }
         else if(exp >= 3 && exp < 10)
         {
            midLevel.enQueue(exp);
         }
         else 
         {
            junior.enQueue(exp);
         }
      }

      // ============== SENIOR LEVEL ==============
      System.out.print("Senior Queue -> ");
      senior.diplay();
      System.out.println();
      System.out.print("Range of Experience-> " + senior.range());
      System.out.println();

      // ============== MID LEVEL ==============
      System.out.print("Mid Level Queue -> ");
      midLevel.diplay();
      System.out.println();
      System.out.print("Range of Experience-> " + midLevel.range());
      System.out.println();

      // ============== JUNIOR LEVEL ==============
      System.out.print("Junior Queue -> ");
      junior.diplay();
      System.out.println();
      System.out.print("Range of Experience-> " + junior.range());
      System.out.println();
   }
}