$(document).ready(function() {
    $('#example').DataTable( {
        "ajax": 'javascript/arrays.txt'
    } );
} );

//
// $(document).ready(function() {
//     $('#example').DataTable( {
//         "processing": true,
//         "serverSide": true,
//         "ajax": 'getCustomers',
//         lengthMenu: [ [10, 15], [10, 15] ],
//         pageLength: 10,
//         destroy: true,
//         "columns": [
//             { "data": "customerId" },
//             { "data": "firstName" },
//             { "data": "otherNames" },
//             { "data": "gender"},
//             { "data": "age"},
//             { "data": "dob" ,
//                 "render": function ( data, type, full, meta ) {
//                     if(full.dob)
//                         return moment(full.dob).format('DD/MM/YYYY');
//                     else return "";
//                 }
//             },
//             { "data": "createdOn" ,
//                 "render": function ( data, type, full, meta ) {
//                     if(full.dob)
//                         return moment(full.createdOn).format('DD/MM/YYYY');
//                     else return "";
//                 }
//             }
//         ]
//     } );
//
//
// } );

// $(document).ready(function() {
//      $('#example').DataTable( {
//         "processing": true,
//         "serverSide": true,
//         "ajax": 'getCustomers',
//         lengthMenu: [[10, 15], [10, 15]],
//         pageLength: 10,
//         destroy: true,
//         "columns": [
//             { "data": "customerId" },
//             { "data": "firstName" },
//             { "data": "otherNames" },
//             { "data": "gender"},
//             { "data": "age"},
//             { "data": "dob" },
//             { "data": "createdOn" }
//         ]
//     } );
//
//
// } );

