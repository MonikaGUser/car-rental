var gValueMiasto;
var tbody = document.querySelector('tbody');
tbody.addEventListener('click', handleClick);

$.ajax({
    url: "http://localhost:8080/city",
    method: "get",
    success: function onSuccess(cities) {
        console.log(cities);
        let $citiesDrop = $("#zmiastoOdbioru");
        // console.log(citysDrop);
        $.each(cities, function() {
            $citiesDrop.append($("<option />").val(this.cityId).text(this.name));
        });
    }
});

$(function() {
    $("#zmiastoOdbioru").on("change",function() {
        var a = $('#zmiastoOdbioru option:selected').text();
        console.log(a);
        gValueMiasto = a;

        const filterValue = a;
        row.each(function(i, el) {
            if($(el).append($row) == filterValue) {
                $(el).show();
            }
        })







        const row = $('#row').find(".cell-name").text(car.location);
        console.log("a" + filterValue + $row.find(".cell-name").text(car.name));
        console.log("b" + row + $row.find(".cell-name").text(car.name));
        row.hide()
        row.each(function(i, el) {
            if($(el).append($row) == filterValue) {
                $(el).show();
            }
        })

    });
});

$("#reserveBTN").click(function () {
    console.log("del");

    delFromDB()


    console.log("del2")
})

$("#search").click(function () {
    console.log("klikles");
    clear()
   reloadTableRows();


    console.log("klik3")
})

;
    $.ajax({
        url: "http://localhost:8080/cars/" ,
        method: "get",
        success: function onSuccess(cars) {
            console.log(cars);
            let $carsDrop = $("#wybierzAuto");
            //console.log(carsDrop);
           $.each(cars, function() {
                $carsDrop.append($("<option />").val(this.id).text(this.name));
            });
        }
    })



function reloadTableRows() {
        console.log("rowww");
    $.ajax({
        url: "http://localhost:8080/cars/"  + gValueMiasto ,
        method: "get",
        success: function onSuccess(cars) {
            console.log("aaa");
            // $("#table-rows > tr:not(#row-template)").remove();
            console.log(cars);




            const $rowTemplate = $("#row-template");
          // $("#table-rows").removeAttr($row);
            //console.log($rowTemplate);
            for (let i = 0; i < cars.length; i++) {
                const car = cars[i];
                const $row = $rowTemplate.clone();
                $row.removeAttr("id");
                $row.css("display", "table-row");
                $row.find(".cell-name").text(car.name);
                //$row.find(".cell-productionDate").text(car.productionDate);
                $row.find(".cell-price").text(car.price);
                $row.find(".reserve").click(function () {
                    reserve(car.id);
                })
                $("#table-rows").append($row);
           }

        }
    });
}

function clear() {
    var table = document. getElementById("table-rows");
//or use : var table = document.all.tableid;
    for(var i = table. rows. length - 1; i > 0; i--)
    {
        table. deleteRow(i);
    }
}


function delFromDB() {
console.log("w del")
    var table = document. getElementById("table-rows");
//or use : var table = document.all.tableid;
    for(var i = table. rows. length - 1; i > 0; i--)
    {
        table. deleteRow(i);
    }

}


function handleClick(event) {
    if (event.target.dataset.action === 'remove') {
        removeRow(event);

    }
}

function removeRow(event) {
    var tr = event.target.closest('tr');
    tr.remove();
    window.location.replace("selection.html");
}