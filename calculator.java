<html>
<title>CALCULATOR</title>
<head> 
<script language = "javascript">
function sh(S)
{
if(document.f1.t1.value == "")
document.f1.t1.value = S;
else
document.f1.t1.value += S;
}
function oper(op)
{
document.f1.h2.value = op;
document.f1.h1.value = document.f1.t1.value;
document.f1.t1.value = " ";
}
function eq()
{
var val;
switch(document.f1.h2.value)
{
case "+": val = parseInt(document.f1.h1.value) + parseInt(document.f1.t1.value);
break;
case "-": val = parseInt(document.f1.h1.value) - parseInt(document.f1.t1.value);
break;
case "*": val = parseInt(document.f1.h1.value) * parseInt(document.f1.t1.value);
break;
case "/": val = parseInt(document.f1.h1.value) / parseInt(document.f1.t1.value);
}
document.f1.t1.value = val;
}
</script>
<body>
<form name = f1 method = "post">
<input type = "text" size = 6 name = t1>
<input type = "hidden" size = 3 name = h1>
<input type = "hidden" size = 3 name = h2><br>
<input type = "button" name = b11 value = "+" onClick = "oper(b11.value)">
<input type = "button" name = b12 value = "-" onClick = "oper(b12.value)">
<input type = "button" name = b13 value = "*" onClick = "oper(b13.value)"><br>
<input type = "button" name = beq value = "=" onClick = "eq()">
<input type = "reset" name = r1 value = "R">
<input type = "button" name = b14 value = "/" onClick = "oper(b14.value)"><br>
<input type = "button" name = b1 value = "1" onClick = "sh(1)">
<input type = "button" name = b2 value = "2" onClick = "sh(2)">
<input type = "button" name = b3 value = "3" onClick = "sh(3)"><br>
<input type = "button" name = b4 value = "4" onClick = "sh(4)">
<input type = "button" name = b5 value = "5" onClick = "sh(5)">
<input type = "button" name = b6 value = "6" onClick = "sh(6)"><br>
<input type = "button" name = b7 value = "7" onClick = "sh(7)">
<input type = "button" name = b8 value = "8" onClick = "sh(8)">
<input type = "button" name = b9 value = "9" onClick = "sh(9)"><br>
</form>
</body>
</html>