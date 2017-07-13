/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function feedreceived()
{
$("#success").text("Thanks for submitting a support request! Please allow 24-48 hours to process your request.");

}

$(document).ready(function () {
   
    $("#feedbackbutton").click(feedreceived);
}
);