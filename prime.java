<html>
<head>
<script language = "javascript">
function check()
{
var p,i,j,flag=0;
j = prompt("Enter a number:");
p = parseInt(j);

for(i=2;i<p-1;i++)
 {  
     if(p%i == 0)
     { alert("Number is not prime!"); break; // breaks out of for loop
     }
     else
     {
         flag = 1; continue; // continue for loop
     }
 } // end of for
   if(flag == 1)  alert("Number is prime!"); else alert("Number is not prime!");
} 
</script>
</head>
<body>
<form method = "post" name = "f1">
<input type = "button" name = b1 value = "click" onClick  = "check()">
</form></body></html>