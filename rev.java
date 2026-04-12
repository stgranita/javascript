<html>
<head>
<script language = "javascript">
function reverseNumber(num) {
    let result= 0;

    while (num != 0) {
        result = result * 10 + num % 10;
        num = Math.floor(num / 10);
    }

    return result;
}

console.log(reverseNumber(12345));
</script>
</head>
<body onLoad = "reverseNumber(12345)">
</body>
</html>