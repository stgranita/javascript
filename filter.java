<html>
<html>
<head>
<title>Filtering array on another array</title>
</head>
<body>
   <script>
const firstArray = [{ "id": 4, "name": "Tata" }, { "id": 11, "name": "Maruti" }, { "id": 14, "name": "Mahindra" } ],
secondArray = [{ "id": 4, "name": "Tata" }, { "id": 11, "name": "Maruti" }, { "id": 15, "name": "Hyundai" }, { "id": 21, "name": "Honda" } ],
result = firstArray.filter(o => secondArray.some(({id,name}) => o.id === id && o.name === name));
        console.log(result);
   </script>
</body>
</html>