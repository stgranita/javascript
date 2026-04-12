<html>
<head>
<script language = "javascript">
function palin()
{

      var s = new String();
      var i,j,l, f =1;
      s = prompt("Enter String");
      l = s.length;
      var k = Math.floor(l/2);
for(i=0,j=l-1;i<k;i++,j--) {
   if (s.charAt(i) == s.charAt(j))
        f = 1;
  else { f = 0; break; }

}
      if(f==1)
            alert("Pallindrome");
      else alert("Not a pallindrome");

}
      </script>
</head>
<body>
<form name = "f1" method = "post">
<input type = "button" name = "b1" value = "SHOW" onClick = palin()>
</form>
</form>
</body>
</html>