const btn = document.getElementById("Section__search__btn");
var select = document.getElementById("talentList");
var choice;
var num;
function printChoice() {
    choice = select.options[select.selectedIndex].value;
    // console.log(choice);
    async function request() {
        const response = await fetch(`http://localhost:8091/api/v1/persons/talent?talentId=${choice}`,
        {
            method: 'GET',
        });
        const data = await response.json();
        console.log(data);
    } 
    request();
}
function choiceNum() {
    num = select.options[select.selectedIndex].value;

    console.log(num);

    
const url = "http://localhost:8091/api/v1/persons";

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

        document.getElementById('table1').textContent = ''; // 요청마다 table 초기화

		let table1 = document.createElement("table");
		let thead1 = document.createElement("thead");
		let tbody1 = document.createElement("tbody");

		table1.appendChild(thead1);
		table1.appendChild(tbody1);

		// js에서 테이블 생성 by #table
		document.getElementById("table1").appendChild(table1);

		// 테이블 헤더 생성
		let row_head1 = document.createElement("tr");
		let heading1_1 = document.createElement("th");
		heading1_1.innerHTML = "name";
		let heading1_2 = document.createElement("th");
		heading1_2.innerHTML = "email";
		let heading1_3 = document.createElement("th");
		heading1_3.innerHTML = "donation";
		let heading1_4 = document.createElement("th");
		heading1_4.innerHTML = "donation name";

		row_head1.appendChild(heading1_1);
		row_head1.appendChild(heading1_2);
		row_head1.appendChild(heading1_3);
		row_head1.appendChild(heading1_4);
		thead1.appendChild(row_head1);
            

            for (index = 0; index < data.length; index++) {
                // if(data[index].donation == num || data[index].benefit == num) {
                
                let row_body = document.createElement("tr");
                let row_body_data_1 = document.createElement("td");
                row_body_data_1.innerHTML = data[index].name;
                let row_body_data_2 = document.createElement("td");
                row_body_data_2.innerHTML = data[index].email;
                let row_body_data_3 = document.createElement("td");
                row_body_data_3.innerHTML = num;
                
                if(data[index].donation == num) {
    
                let row_body_data_4 = document.createElement("td");
                
                // if(num == null) {
                //     continue
                // }
                let listD;
                let listB = data[index].benefit;
    
                if(num == 1) {
                    listD = "국어"
                } else if(num == 2) {
                    listD = "수학"
                } else if(num == 3) {
                    listD = "영어"
                } else if(num == 4) {
                    listD = "피아노"
                } else if(num == 5) {
                    listD = "노래"
                } else if(num == 6) {
                    listD = "마술"
                } else if(num == 7) {
                    listD = "보건 및 의료"
                } else if(num == 8) {
                    listD = "무료법률상담"
                } else if(num == 9) {
                    listD = "청소년 상담"
                } else if (num == 10) {
                    listD = "JAVA 코딩 교육"
                }
    
                row_body_data_4.innerHTML = listD;
                
                
                row_body.appendChild(row_body_data_1);
                row_body.appendChild(row_body_data_2);
                row_body.appendChild(row_body_data_3);
                row_body.appendChild(row_body_data_4);
                tbody1.appendChild(row_body);
            }
        }
        document.getElementById('table2').textContent = ''; // 요청마다 table 초기화

		let table = document.createElement("table");
		let thead = document.createElement("thead");
		let tbody = document.createElement("tbody");

		table.appendChild(thead);
		table.appendChild(tbody);

		// js에서 테이블 생성 by #table
		document.getElementById("table2").appendChild(table);

		// 테이블 헤더 생성
		let row_head = document.createElement("tr");
		let heading_1 = document.createElement("th");
		heading_1.innerHTML = "name";
		let heading_2 = document.createElement("th");
		heading_2.innerHTML = "email";
		let heading_3 = document.createElement("th");
		heading_3.innerHTML = "benefit";
		let heading_4 = document.createElement("th");
		heading_4.innerHTML = "benefit name";

		row_head.appendChild(heading_1);
		row_head.appendChild(heading_2);
		row_head.appendChild(heading_3);
		row_head.appendChild(heading_4);
		thead.appendChild(row_head);
            
           

            for (index = 0; index < data.length; index++) {
                // if(data[index].benefit == num || data[index].benefit == num) {
                
                let row_body = document.createElement("tr");
                let row_body_data_1 = document.createElement("td");
                row_body_data_1.innerHTML = data[index].name;
                let row_body_data_2 = document.createElement("td");
                row_body_data_2.innerHTML = data[index].email;
                let row_body_data_3 = document.createElement("td");
                row_body_data_3.innerHTML = num;
                
                if(data[index].benefit == num) {
    
                let row_body_data_4 = document.createElement("td");
                
                // if(num == null) {
                //     continue
                // }
                let listD;
                let listB = data[index].benefit;
    
                if(num == 1) {
                    listD = "국어"
                } else if(num == 2) {
                    listD = "수학"
                } else if(num == 3) {
                    listD = "영어"
                } else if(num == 4) {
                    listD = "피아노"
                } else if(num == 5) {
                    listD = "노래"
                } else if(num == 6) {
                    listD = "마술"
                } else if(num == 7) {
                    listD = "보건 및 의료"
                } else if(num == 8) {
                    listD = "무료법률상담"
                } else if(num == 9) {
                    listD = "청소년 상담"
                } else if (num == 10) {
                    listD = "JAVA 코딩 교육"
                }
    
                row_body_data_4.innerHTML = listD;
                
                
                row_body.appendChild(row_body_data_1);
                row_body.appendChild(row_body_data_2);
                row_body.appendChild(row_body_data_3);
                row_body.appendChild(row_body_data_4);
                tbody.appendChild(row_body);
            }
        }
		
	});

}
btn.addEventListener('click', printChoice)
btn.addEventListener('click', choiceNum)

