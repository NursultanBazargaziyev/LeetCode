class Solution {
    static public String defangIPaddr(String address) {
        return String.join( "[.]", address.split("\\."));
    }

}