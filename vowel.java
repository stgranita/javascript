<html>
<title>Vowel Count</title>
<head>
<script language = "javascript">
function chk()
{
var s,cnt=0, cnt1 = 0,i;
var s= new String(document.f1.t1.value);
for(i=0;i<s.length;i++)
{
if((s.charAt(i) == 'a')||(s.charAt(i) == 'e')||(s.charAt(i) == 'i')||(s.charAt(i) == 'o')||(s.charAt(i) == 'u'))
cnt = cnt +1; 
} // end of for
document.write("Number of vowels = " + cnt);
}
</script> </head>
<body>
<font color = "Blue"><h1>VOWEL COUNT</h1></font>
<form name = f1 method ="post">
Enter a String:<input type = "text" name = t1><br><hr>
<input type = "button" name= b1 value="CHECK" onClick = "chk()">
<input type = "reset" name= b2 value="CLEAR">
</form>
</body>
</html>
