// Shallow Copy Example
class ShallowCopy {
    int[] arr;

    // Constructor
    public ShallowCopy(int[] arr) {
        this.arr = arr; // Just copying reference, NOT creating a new array
    }
}

// Deep Copy Example
class DeepCopy {
    int[] arr;

    // Constructor
    public DeepCopy(int[] arr) {
        this.arr = arr.clone(); // Creating a NEW COPY of the array
    }
}

// MAIN FUNCTION TO TEST
public class CopyCon {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Original array

        // 🔴 Shallow Copy: Both share the same array
        ShallowCopy obj1 = new ShallowCopy(nums);
        ShallowCopy obj2 = new ShallowCopy(obj1.arr);
        obj2.arr[0] = 100; // Changing the first element

        System.out.println("Shallow Copy:");
        System.out.println("obj1: " + obj1.arr[0]); // Output: 100
        System.out.println("obj2: " + obj2.arr[0]); // Output: 100 (Changed in both!)

        System.out.println("\n----------------------\n");

        // 🔴 Deep Copy: Separate arrays (Independent copies)
        DeepCopy obj3 = new DeepCopy(nums);
        DeepCopy obj4 = new DeepCopy(obj3.arr);
        obj4.arr[0] = 500; // Changing the first element

        System.out.println("Deep Copy:");
        System.out.println("obj3: " + obj3.arr[0]); // Output: 100 (Original stays same)
        System.out.println("obj4: " + obj4.arr[0]); // Output: 500 (Only obj4 changes!)
    }
}
