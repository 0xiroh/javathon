// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadUsers();
  alert("Sup");
  $('#users').DataTable();


});

async function loadUsers(){
    const request = await fetch('user', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const userList = await request.json();

    console.log(userList);

    let listHTML = '';
    for (let user of userList){
        let userHTML = '<tr><td>1234</td><td>'+user.firstName+' '+user.lastName+'</td><td>Tincho</td><td>'+user.email+'</td><td>'+user.phone+'</td><td>Delete</td></tr>'
        listHTML += userHTML;
    }

    document.querySelector("#users tbody").innerHTML = listHTML;

  };
