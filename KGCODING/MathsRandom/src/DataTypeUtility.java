import java.lang.reflect.Array;
import java.util.*;

/**
 * DataTypeUtility - A comprehensive utility class for Java datatype checking and analysis.
 *
 * This class provides methods to identify, analyze, and get information about any Java datatype
 * including primitives, objects, arrays, collections, and maps.
 *
 * @author Your Name
 * @version 1.0
 * @since 2025
 *
 * Features:
 * - Universal datatype detection
 * - Primitive type handling with method overloading
 * - Array analysis with element preview
 * - Collection and Map type information
 * - Interface implementation checking
 * - Type comparison utilities
 * - Complete object analysis
 *
 * Usage Examples:
 * <pre>
 * // Basic usage
 * System.out.println(DataTypeUtility.getDataTypeInfo(42));
 *
 * // Array analysis
 * int[] arr = {1, 2, 3};
 * DataTypeUtility.analyzeObject(arr);
 *
 * // Type comparison
 * boolean same = DataTypeUtility.isSameType(obj1, obj2);
 * </pre>
 */
public class DataTypeUtility {

    /**
     * Main utility method that provides comprehensive datatype information for any object.
     *
     * This method automatically detects the type of object and provides appropriate
     * information including type name, size/length, and content preview.
     *
     * @param obj The object to analyze (can be null)
     * @return String containing detailed type information
     *
     * @example
     * <pre>
     * Object obj = "Hello World";
     * String info = getDataTypeInfo(obj);
     * // Returns: "String, Length: 11, Value: "Hello World""
     * </pre>
     */
    public static String getDataTypeInfo(Object obj) {
        if (obj == null) {
            return "null";
        }

        Class<?> clazz = obj.getClass();
        String typeName = clazz.getSimpleName();

        // Array type detection and analysis
        if (clazz.isArray()) {
            return getArrayInfo(obj);
        }

        // Collection type detection (List, Set, Queue, etc.)
        if (obj instanceof Collection) {
            return getCollectionInfo((Collection<?>) obj);
        }

        // Map type detection (HashMap, TreeMap, etc.)
        if (obj instanceof Map) {
            return getMapInfo((Map<?, ?>) obj);
        }

        // Primitive wrapper detection (Integer, Double, etc.)
        if (isPrimitiveWrapper(clazz)) {
            return getPrimitiveInfo(obj, typeName);
        }

        // String type special handling
        if (obj instanceof String) {
            return getStringInfo((String) obj);
        }

        // Default object information
        return getObjectInfo(obj, typeName);
    }

    /**
     * Analyzes array objects and provides detailed information.
     *
     * @param array The array object to analyze
     * @return String containing array type, length, and element preview
     *
     * @example
     * <pre>
     * int[] arr = {1, 2, 3, 4, 5};
     * // Returns: "Array Type: int[], Length: 5, Elements: [1, 2, 3, 4, 5]"
     * </pre>
     */
    private static String getArrayInfo(Object array) {
        Class<?> componentType = array.getClass().getComponentType();
        int length = Array.getLength(array);

        StringBuilder info = new StringBuilder();
        info.append("Array Type: ").append(componentType.getSimpleName()).append("[]")
                .append(", Length: ").append(length)
                .append(", Elements: [");

        // Show first 5 elements to avoid overwhelming output
        for (int i = 0; i < Math.min(length, 5); i++) {
            if (i > 0) info.append(", ");
            info.append(Array.get(array, i));
        }
        if (length > 5) info.append("...");
        info.append("]");

        return info.toString();
    }

    /**
     * Analyzes Collection objects (List, Set, Queue, etc.).
     *
     * @param collection The collection to analyze
     * @return String containing collection type, size, and element type information
     *
     * @example
     * <pre>
     * List&lt;String&gt; list = Arrays.asList("A", "B", "C");
     * // Returns: "Collection Type: ArrayList, Size: 3, First Element Type: String"
     * </pre>
     */
    private static String getCollectionInfo(Collection<?> collection) {
        String collectionType = collection.getClass().getSimpleName();
        StringBuilder info = new StringBuilder();
        info.append("Collection Type: ").append(collectionType)
                .append(", Size: ").append(collection.size());

        // Get type of first element if collection is not empty
        if (!collection.isEmpty()) {
            Object firstElement = collection.iterator().next();
            if (firstElement != null) {
                info.append(", First Element Type: ")
                        .append(firstElement.getClass().getSimpleName());
            } else {
                info.append(", Contains null elements");
            }
        }

        return info.toString();
    }

    /**
     * Analyzes Map objects (HashMap, TreeMap, etc.).
     *
     * @param map The map to analyze
     * @return String containing map type, size, key type, and value type
     *
     * @example
     * <pre>
     * Map&lt;String, Integer&gt; map = new HashMap&lt;&gt;();
     * map.put("One", 1);
     * // Returns: "Map Type: HashMap, Size: 1, Key Type: String, Value Type: Integer"
     * </pre>
     */
    private static String getMapInfo(Map<?, ?> map) {
        String mapType = map.getClass().getSimpleName();
        StringBuilder info = new StringBuilder();
        info.append("Map Type: ").append(mapType)
                .append(", Size: ").append(map.size());

        // Get key-value types from first entry
        if (!map.isEmpty()) {
            Map.Entry<?, ?> firstEntry = map.entrySet().iterator().next();
            Object key = firstEntry.getKey();
            Object value = firstEntry.getValue();

            info.append(", Key Type: ")
                    .append(key != null ? key.getClass().getSimpleName() : "null")
                    .append(", Value Type: ")
                    .append(value != null ? value.getClass().getSimpleName() : "null");
        }

        return info.toString();
    }

    /**
     * Provides information for primitive wrapper objects.
     *
     * @param obj The primitive wrapper object
     * @param typeName The simple name of the type
     * @return String containing wrapper type and value
     */
    private static String getPrimitiveInfo(Object obj, String typeName) {
        return "Primitive Wrapper: " + typeName + ", Value: " + obj;
    }

    /**
     * Provides detailed information for String objects.
     *
     * @param str The string to analyze
     * @return String containing length and content (truncated if too long)
     */
    private static String getStringInfo(String str) {
        return "String, Length: " + str.length() + ", Value: \"" +
                (str.length() > 20 ? str.substring(0, 20) + "..." : str) + "\"";
    }

    /**
     * Provides general information for any object.
     *
     * @param obj The object to analyze
     * @param typeName The simple name of the object's type
     * @return String containing object type and hash code
     */
    private static String getObjectInfo(Object obj, String typeName) {
        return "Object Type: " + typeName + ", Hash: " + obj.hashCode();
    }

    /**
     * Checks if a class is a primitive wrapper type.
     *
     * @param clazz The class to check
     * @return true if the class is a primitive wrapper, false otherwise
     */
    private static boolean isPrimitiveWrapper(Class<?> clazz) {
        return clazz == Integer.class || clazz == Double.class ||
                clazz == Float.class || clazz == Long.class ||
                clazz == Short.class || clazz == Byte.class ||
                clazz == Character.class || clazz == Boolean.class;
    }

    // ==================== METHOD OVERLOADING FOR PRIMITIVES ====================

    /**
     * Checks datatype for primitive int values.
     *
     * @param value The int value to check
     * @return String containing primitive type information
     */
    public static String checkType(int value) {
        return "Primitive: int, Value: " + value;
    }

    /**
     * Checks datatype for primitive double values.
     *
     * @param value The double value to check
     * @return String containing primitive type information
     */
    public static String checkType(double value) {
        return "Primitive: double, Value: " + value;
    }

    /**
     * Checks datatype for primitive boolean values.
     *
     * @param value The boolean value to check
     * @return String containing primitive type information
     */
    public static String checkType(boolean value) {
        return "Primitive: boolean, Value: " + value;
    }

    /**
     * Checks datatype for primitive char values.
     *
     * @param value The char value to check
     * @return String containing primitive type information
     */
    public static String checkType(char value) {
        return "Primitive: char, Value: '" + value + "'";
    }

    /**
     * Checks datatype for primitive float values.
     *
     * @param value The float value to check
     * @return String containing primitive type information
     */
    public static String checkType(float value) {
        return "Primitive: float, Value: " + value;
    }

    /**
     * Checks datatype for primitive long values.
     *
     * @param value The long value to check
     * @return String containing primitive type information
     */
    public static String checkType(long value) {
        return "Primitive: long, Value: " + value;
    }

    /**
     * Checks datatype for primitive short values.
     *
     * @param value The short value to check
     * @return String containing primitive type information
     */
    public static String checkType(short value) {
        return "Primitive: short, Value: " + value;
    }

    /**
     * Checks datatype for primitive byte values.
     *
     * @param value The byte value to check
     * @return String containing primitive type information
     */
    public static String checkType(byte value) {
        return "Primitive: byte, Value: " + value;
    }

    // ==================== ADVANCED TYPE CHECKING UTILITIES ====================

    /**
     * Determines if an object is of numeric type.
     *
     * Checks for all numeric wrapper classes: Integer, Double, Float, Long, Short, Byte.
     *
     * @param obj The object to check
     * @return true if object is numeric type, false otherwise
     *
     * @example
     * <pre>
     * boolean isNum = isNumericType(42);        // true
     * boolean isNum2 = isNumericType("42");     // false
     * </pre>
     */
    public static boolean isNumericType(Object obj) {
        if (obj == null) return false;
        Class<?> clazz = obj.getClass();
        return clazz == Integer.class || clazz == Double.class ||
                clazz == Float.class || clazz == Long.class ||
                clazz == Short.class || clazz == Byte.class;
    }

    /**
     * Determines if an object is a Collection type.
     *
     * @param obj The object to check
     * @return true if object implements Collection interface, false otherwise
     */
    public static boolean isCollectionType(Object obj) {
        return obj instanceof Collection;
    }

    /**
     * Determines if an object is an array type.
     *
     * @param obj The object to check
     * @return true if object is an array, false otherwise
     */
    public static boolean isArrayType(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    /**
     * Compares if two objects are of the same type.
     *
     * Uses exact class comparison, not instanceof check.
     *
     * @param obj1 First object to compare
     * @param obj2 Second object to compare
     * @return true if both objects are of exactly the same type, false otherwise
     *
     * @example
     * <pre>
     * boolean same = isSameType(42, 100);        // true (both Integer)
     * boolean same2 = isSameType(42, "42");      // false (Integer vs String)
     * boolean same3 = isSameType(null, null);    // true (both null)
     * </pre>
     */
    public static boolean isSameType(Object obj1, Object obj2) {
        if (obj1 == null && obj2 == null) return true;
        if (obj1 == null || obj2 == null) return false;
        return obj1.getClass() == obj2.getClass();
    }

    /**
     * Gets information about all interfaces implemented by an object.
     *
     * @param obj The object to analyze
     * @return String containing list of implemented interfaces
     *
     * @example
     * <pre>
     * List&lt;String&gt; list = new ArrayList&lt;&gt;();
     * String interfaces = getInterfaceInfo(list);
     * // Returns: "Interfaces: List, RandomAccess, Cloneable, Serializable"
     * </pre>
     */
    public static String getInterfaceInfo(Object obj) {
        if (obj == null) return "null";

        Class<?>[] interfaces = obj.getClass().getInterfaces();
        if (interfaces.length == 0) {
            return "No interfaces implemented";
        }

        StringBuilder info = new StringBuilder("Interfaces: ");
        for (int i = 0; i < interfaces.length; i++) {
            if (i > 0) info.append(", ");
            info.append(interfaces[i].getSimpleName());
        }
        return info.toString();
    }

    /**
     * Performs a complete analysis of any object and prints detailed information.
     *
     * This method combines all utility methods to provide comprehensive
     * information about an object including:
     * - Basic type information
     * - Interface implementation
     * - Type category checks
     * - Full class name and package
     *
     * @param obj The object to analyze completely
     *
     * @example
     * <pre>
     * int[] array = {1, 2, 3};
     * DataTypeUtility.analyzeObject(array);
     *
     * Output:
     * === COMPLETE TYPE ANALYSIS ===
     * Basic Info: Array Type: int[], Length: 3, Elements: [1, 2, 3]
     * Interface Info: Interfaces: Cloneable, Serializable
     * Is Numeric: false
     * Is Collection: false
     * Is Array: true
     * Full Class Name: [I
     * Package: null
     * ===============================
     * </pre>
     */
    public static void analyzeObject(Object obj) {
        System.out.println("=== COMPLETE TYPE ANALYSIS ===");
        System.out.println("Basic Info: " + getDataTypeInfo(obj));
        System.out.println("Interface Info: " + getInterfaceInfo(obj));
        System.out.println("Is Numeric: " + isNumericType(obj));
        System.out.println("Is Collection: " + isCollectionType(obj));
        System.out.println("Is Array: " + isArrayType(obj));

        if (obj != null) {
            System.out.println("Full Class Name: " + obj.getClass().getName());
            Package pkg = obj.getClass().getPackage();
            System.out.println("Package: " + (pkg != null ? pkg.getName() : "null"));
        }
        System.out.println("===============================\n");
    }

    /**
     * Gets the size/length of any object that has a measurable size.
     *
     * Works with:
     * - Arrays (length)
     * - Collections (size)
     * - Maps (size)
     * - Strings (length)
     *
     * @param obj The object to measure
     * @return Size/length of the object, or -1 if not measurable
     *
     * @example
     * <pre>
     * int[] arr = {1, 2, 3};
     * int size = getObjectSize(arr);  // Returns: 3
     *
     * String str = "Hello";
     * int size2 = getObjectSize(str); // Returns: 5
     * </pre>
     */
    public static int getObjectSize(Object obj) {
        if (obj == null) return -1;

        if (obj.getClass().isArray()) {
            return Array.getLength(obj);
        } else if (obj instanceof Collection) {
            return ((Collection<?>) obj).size();
        } else if (obj instanceof Map) {
            return ((Map<?, ?>) obj).size();
        } else if (obj instanceof String) {
            return ((String) obj).length();
        }

        return -1; // Size not measurable
    }

    /**
     * Converts any object to a readable string representation.
     *
     * Provides better toString() output for arrays and collections.
     *
     * @param obj The object to convert to string
     * @return String representation of the object
     */
    public static String objectToString(Object obj) {
        if (obj == null) return "null";

        if (obj.getClass().isArray()) {
            return Arrays.deepToString(new Object[]{obj});
        } else if (obj instanceof Collection) {
            return obj.toString();
        } else if (obj instanceof Map) {
            return obj.toString();
        }

        return obj.toString();
    }

    /**
     * Demo method demonstrating all utility features.
     *
     * This method serves as both documentation and testing for the utility class.
     * It shows examples of all major features and expected outputs.
     */
    public static void main(String[] args) {
        System.out.println("========== DATATYPE UTILITY DEMO ==========\n");

        // ===== PRIMITIVE WRAPPERS =====
        System.out.println("1. PRIMITIVE WRAPPERS:");
        System.out.println(getDataTypeInfo(42));
        System.out.println(getDataTypeInfo(3.14));
        System.out.println(getDataTypeInfo(true));
        System.out.println(getDataTypeInfo('A'));
        System.out.println();

        // ===== PRIMITIVES (METHOD OVERLOADING) =====
        System.out.println("2. PRIMITIVES (Method Overloading):");
        System.out.println(checkType(100));
        System.out.println(checkType(2.5));
        System.out.println(checkType(false));
        System.out.println(checkType('Z'));
        System.out.println();

        // ===== STRINGS =====
        System.out.println("3. STRINGS:");
        System.out.println(getDataTypeInfo("Hello World"));
        System.out.println(getDataTypeInfo("This is a very long string that will be truncated in the output"));
        System.out.println();

        // ===== ARRAYS =====
        System.out.println("4. ARRAYS:");
        int[] intArray = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
        double[][] matrix = {{1.1, 2.2}, {3.3, 4.4}};

        System.out.println(getDataTypeInfo(intArray));
        System.out.println(getDataTypeInfo(stringArray));
        System.out.println(getDataTypeInfo(matrix));
        System.out.println();

        // ===== COLLECTIONS =====
        System.out.println("5. COLLECTIONS:");
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Queue<String> queue = new LinkedList<>(Arrays.asList("First", "Second"));

        System.out.println(getDataTypeInfo(list));
        System.out.println(getDataTypeInfo(set));
        System.out.println(getDataTypeInfo(queue));
        System.out.println();

        // ===== MAPS =====
        System.out.println("6. MAPS:");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "First");
        treeMap.put(2, "Second");

        System.out.println(getDataTypeInfo(hashMap));
        System.out.println(getDataTypeInfo(treeMap));
        System.out.println();

        // ===== NULL HANDLING =====
        System.out.println("7. NULL HANDLING:");
        System.out.println(getDataTypeInfo(null));
        System.out.println();

        // ===== COMPLETE ANALYSIS EXAMPLES =====
        System.out.println("8. COMPLETE ANALYSIS EXAMPLES:");
        analyzeObject(intArray);
        analyzeObject("Sample String");
        analyzeObject(new ArrayList<>());

        // ===== TYPE COMPARISON =====
        System.out.println("9. TYPE COMPARISON:");
        System.out.println("Same type (42, 100): " + isSameType(42, 100));
        System.out.println("Same type (42, \"42\"): " + isSameType(42, "42"));
        System.out.println("Same type (null, null): " + isSameType(null, null));
        System.out.println();

        // ===== UTILITY CHECKS =====
        System.out.println("10. UTILITY CHECKS:");
        System.out.println("Is 42 numeric? " + isNumericType(42));
        System.out.println("Is \"42\" numeric? " + isNumericType("42"));
        System.out.println("Is List collection? " + isCollectionType(list));
        System.out.println("Is array an array? " + isArrayType(intArray));
        System.out.println();

        // ===== SIZE MEASUREMENTS =====
        System.out.println("11. SIZE MEASUREMENTS:");
        System.out.println("Array size: " + getObjectSize(intArray));
        System.out.println("List size: " + getObjectSize(list));
        System.out.println("String length: " + getObjectSize("Hello"));
        System.out.println("Map size: " + getObjectSize(hashMap));

        System.out.println("\n========== DEMO COMPLETE ==========");
    }
}