

$(document).ready(function(){
    $(' .nBtn, .table .eBtn').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();
        if(text=='Edytuj') {


            $.get(href, function (persons, status) {
               $('.myForm #id').val(persons.id);
                $('.myForm #firstName').val(persons.firstName);
                $('.myForm #lastName').val(persons.lastName);
                $('.myForm #cities').val(persons.cities);
                $('.myForm #testStatus').val(persons.testStatus);

            });


        }else{
          $('.myForm #id').val('');
            $('.myForm #firstName').val('');
            $('.myForm #lastName').val('');
            $('.myForm #cities').val('');
            $('.myForm #testStatus').val('');


        }
        $('.myForm #exampleModal').modal();
    });

    $('.table .delBtn').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href',href);
        $('#myModal').modal();
        });
});