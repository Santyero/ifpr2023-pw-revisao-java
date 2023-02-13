function Maiusculo() {
    const area = document.querySelector('textarea');
    area.value = area.value.toUpperCase();
}

function Minusculo() {
    const area = document.querySelector('textarea');
    area.value = area.value.toLowerCase();
}

function PrimeiraLetraPalavraMaiuscula() {
    const area = document.querySelector('textarea');
    area.value = area.value.replace(/(^\w{1})|(\s{1}\w{1})/g, match => match.toUpperCase());
}

function PrimeiraLetraFraseMaiuscula() {
    const area = document.querySelector('textarea');
    area.value = area.value.replace(/(^\w{1})|(\.\s{1}\w{1})/g, match => match.toUpperCase());
}