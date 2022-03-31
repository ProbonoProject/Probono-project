const url = "http://localhost:8090/api/v1/persons";

// fetch(`${url}/donators`)
//     .then(res => {
//         return res.json();
//     })
//     .then(data => {
//         console.log(data);

//     });

fetch(`${url}`)
	.then((res) => {
		return res.json();
	})
	.then((data) => {
		console.log(data);

		let table = document.createElement("table");
		let thead = document.createElement("thead");
		let tbody = document.createElement("tbody");

		table.appendChild(thead);
		table.appendChild(tbody);

		// js에서 테이블 생성 by #table
		document.getElementById("table").appendChild(table);

		// 테이블 헤더 생성
		let row_head = document.createElement("tr");
		let heading_1 = document.createElement("th");
		heading_1.innerHTML = "name";
		let heading_2 = document.createElement("th");
		heading_2.innerHTML = "email";
		let heading_3 = document.createElement("th");
		heading_3.innerHTML = "listBenefit";
		let heading_5 = document.createElement("th");
		heading_5.innerHTML = "listB";

		row_head.appendChild(heading_1);
		row_head.appendChild(heading_2);
		row_head.appendChild(heading_3);
		row_head.appendChild(heading_5);
		thead.appendChild(row_head);

		for (index = 0; index < 10; index++) {
			let row_body = document.createElement("tr");
			let row_body_data_1 = document.createElement("td");
			row_body_data_1.innerHTML = data[index].name;
			let row_body_data_2 = document.createElement("td");
			row_body_data_2.innerHTML = data[index].email;
			let row_body_data_3 = document.createElement("td");
			row_body_data_3.innerHTML = data[index].listBenefit;


			let row_body_data_5 = document.createElement("td");
            
            if(data[index].listBenefit == null) {
                continue
            }
			let listB = Object.values(data[index].listBenefit);

			function updateArray(myArray, oldValue, newValue) {
				if (!myArray instanceof Array) return;
				const index = myArray.indexOf(oldValue);
				if (index !== -1) {
					myArray[index] = newValue;
				}
			}

			updateArray(listB, 1, "국어");
			updateArray(listB, 2, "수학");
			updateArray(listB, 3, "영어");
			updateArray(listB, 4, "피아노");
			updateArray(listB, 5, "노래");
			updateArray(listB, 6, "마술");
			updateArray(listB, 7, "보건 및 의료");
			updateArray(listB, 8, "무료법률상담");
			updateArray(listB, 9, "청소년 상담");
			updateArray(listB, 10, "JAVA 코딩 교육");

			row_body_data_5.innerHTML = listB;


			row_body.appendChild(row_body_data_1);
			row_body.appendChild(row_body_data_2);
			row_body.appendChild(row_body_data_3);
			row_body.appendChild(row_body_data_5);
            tbody.appendChild(row_body);
		}
	});
