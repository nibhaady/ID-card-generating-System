package idcardgeneratingsystem.newpackage;

import java.util.regex.Pattern;
public class isWord {
public static boolean Word(String in)
{
return Pattern.matches("[a-zA-Z -]+", in);//returns true if the String 'in' has characters from a to z or A to Zor a space
} //else the function returns false
}