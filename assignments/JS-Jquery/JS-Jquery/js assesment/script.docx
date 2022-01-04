let btnGet = document.querySelector('button');
let myTable = document.querySelector('#table');
let employees = [
    { name: 'James', age: 21, empid: 1121 },
    { name: 'Rony', age: 31,  empid: 1124 },
    { name: 'Peter', age: 58, empid: 1123 },
    { name: 'Marks', age: 20, empid: 1125 },
   
]
let headers = ['Name', 'Age', 'EMPID'];
btnGet.addEventListener('click', () => {
    let table = document.createElement('table');
    let headerRow = document.createElement('tr');
    headers.forEach(headerText => {
        let header = document.createElement('th');
        let textNode = document.createTextNode(headerText);
        header.appendChild(textNode);
        headerRow.appendChild(header);
    });
    table.appendChild(headerRow);
    employees.forEach(emp => {
        let row = document.createElement('tr');
        Object.values(emp).forEach(text => {
            let cell = document.createElement('td');
            let textNode = document.createTextNode(text);
            cell.appendChild(textNode);
            row.appendChild(cell);
        })
        table.appendChild(row);
    });
    myTable.appendChild(table);
});