<html>
<head>
<script language = "javascript">
function processData() {
    let input = new Array(9);
    let cnt1 =0, sum=0;
    let ucase = "[";
    //input = [1, 'hello', 3.5, 'world', 4, undefined, null, 'JavaScript', true];
    let i,j=0;
    let cnt=0;
    let inp = prompt("How many elements you want to input", "");
    cnt = parseInt(inp);
    for(i=0;i<cnt;i++)
    {
        input[i] = prompt("Enter element", "");
        if (input[i].match('true') || input[i].match('TRUE')) input[i] = JSON.parse('true');
        else if (input[i].match('false') || input[i].match('FALSE')) input[i] = JSON.parse('false');
        else if (!(typeof input[i] == 'undefined') && isNaN(input[i])  && input[i]!=null) { ucase = ucase + input[i] + ",";}
       else if (!isNaN(input[i]) && input[i]!= "") {  j = parseInt(input[i]); cnt1 = cnt1 +1; sum = sum + j }
    }
    document.writeln("Sum:" + sum);
    if (sum == 0) document.writeln(" Average: 0"); else  document.writeln(" Average:" + sum/cnt1);
    document.writeln(" uppercaseStrings:" + ucase.toUpperCase() + "]");
}

</script>
</head>
<body>
<form name = f1 method = "post">
<input type = "button" name = b1 value = "CHECK" onClick = "processData()">
</form>
</body>
</html>