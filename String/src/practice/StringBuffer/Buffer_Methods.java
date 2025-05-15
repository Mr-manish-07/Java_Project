package practice.StringBuffer;

public class Buffer_Methods {

//    append()	Used to add text at the end of the existing text.
//    length()	The length of a StringBuffer can be found by the length( ) method.
//    capacity()	the total allocated capacity can be found by the capacity( ) method.
//    charAt()	This method returns the char value in this sequence at the specified index.
//    delete()	Deletes a sequence of characters from the invoking object.
//    deleteCharAt()	Deletes the character at the index specified by the loc.
//    ensureCapacity()	Ensures capacity is at least equal to the given minimum.
//    insert()	Inserts text at the specified index position.
//    length()	Returns the length of the string.
//    reverse()	Reverse the characters within a StringBuffer object.
//    replace()	Replace one set of characters with another set inside a StringBuffer object.
//

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java Course ");
        sb.append("with Spring Boot framework");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(5));
        System.out.println(sb.delete(5,11)); // From index 5 to 10 will be deleted
        System.out.println(sb.deleteCharAt(4));
        System.out.println(sb.insert(5,"course "));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0,5,"Python "));
    }
}
