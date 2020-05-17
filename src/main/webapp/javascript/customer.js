// $(document).ready(function() {
//     $('#example').DataTable( {
//         "ajax": 'javascript/arrays.json'
//     } );
// } );

$(document).ready(function () {
    $.ajax({
        url: 'getCustomers',
        method: 'get',
        // data :{age:'01'},          // this is input parameter for your function
        dataType: 'json',
        contentType: 'text/json',
        success: function (res) {
            $('#example').dataTable({
                data: res,
                columns: [
                    {"data": "customerId"},
                    {"data": "firstName"},
                    {"data": "otherNames"},
                    {
                        "data": "gender",
                        "render": function (data, type, full, meta) {
                            return (full.gender === "M") ? 'Male' : 'Female';
                        }
                    },
                    {"data": "age"},
                    {
                        "data": "dob",
                        "render": function (data, type, full, meta) {
                            if (full.dob)
                                return moment(full.dob).format('DD/MM/YYYY');
                            else return "";
                        }
                    },
                    {
                        "data": "createdOn",
                        "render": function (data, type, full, meta) {
                            if (full.dob)
                                return moment(full.createdOn).format('DD/MM/YYYY');
                            else return "";
                        }
                    },
                    {
                        "data": "customerId",
                        "render": function (data, type, full, meta) {
                            return '<button type="button" class="btn btn-info btn-xs" type="button" data-customers=' + encodeURI(JSON.stringify(full)) + ' onclick="editClient(this);">Edit</button>';
                        }

                    },
                    {
                        "data": "customerId",
                        "render": function (data, type, full, meta) {
                            return '<button type="button" class="btn btn-danger btn-xs" data-customers=' + encodeURI(JSON.stringify(full)) + ' onclick="deleteClient(this);">Delete</button>';
                        }

                    },
                ]
            });
        }
    });
});

