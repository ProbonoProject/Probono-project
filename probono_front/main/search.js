document.getElementById('bookName').addEventListener('search', () => {
    const bookName = document.getElementById('bookName').value;

    const xhr = new XMLHttpRequest();

    const url = '/search/book';

    xhr.onreadystatechange = () => {
        if (xhr.readyState == 4 && xhr.status == 200) {
            const res = xhr.responseText;
            // parsedResult : API에서 받아온 결과값(res)을 JSON으로 파싱
            const parsedResult = JSON.parse(res);

                document.getElementById('table').textContent = ''; // 요청마다 table 초기화

                // 테이블 작성
                let table = document.createElement('table');
                let thead = document.createElement('thead');
                let tbody = document.createElement('tbody');
                
                table.appendChild(thead);
                table.appendChild(tbody);
                
                // js에서 테이블 생성 by #table
                document.getElementById('table').appendChild(table);
                
                // 테이블 헤더 생성 
                let row_head = document.createElement('tr');
                let heading_1 = document.createElement('th');
                heading_1.innerHTML = "title";
                
                row_head.appendChild(heading_1);

                thead.appendChild(row_head);
                
                for(index = 0; index < 10; index++) {
                    const bookIndex = 'bookResult' + index;
                    // const bookResult = document.getElementById(bookIndex);
                    // const br = `검색 결과 :${parsedResult.items[index].title}, ${parsedResult.items[index].author},${parsedResult.items[index].link}`;
                
                // 파싱 데이터를 테이블에 출력
                let row_body = document.createElement('tr');
                let row_body_data_1 = document.createElement('td');
                row_body_data_1.innerHTML = parsedResult.items[index].title;
                
                row_body.appendChild(row_body_data_1);

                tbody.appendChild(row_body);
                
                }



            
        }
    };

    xhr.open("POST", url);

    xhr.setRequestHeader("Content-type", "application/json");

    const requestData = {
        bookName,
    };

    // object -> string
    jsonToString = JSON.stringify(requestData);

    xhr.send(jsonToString);

})
