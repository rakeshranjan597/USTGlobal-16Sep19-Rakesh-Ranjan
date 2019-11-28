import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';

@ Directive({
    // tslint:disable-next-line:directive-selector
    selector : '[custDir]'
})


export class CustomDirective {

    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'red' ;
    }

    @ HostBinding('style.backgroundColor') backgroundColor = 'yellow';

    @ HostListener('mouseenter') mouseEnterEvent() {
        this.el.nativeElement.style.backgroundColor = 'pink';
    }
    @ HostListener('mouseleave') mouseLeaveEvent() {
        this.el.nativeElement.style.backgroundColor = 'magenta';
    }



}


