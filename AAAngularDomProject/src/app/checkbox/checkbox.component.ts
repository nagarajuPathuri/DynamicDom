// checkbox.component.ts
import { Component, Input } from '@angular/core';
import { CommonModule} from '@angular/common';
import {MatCheckboxModule} from '@angular/material/checkbox';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-checkbox',
  standalone: true,
  imports: [CommonModule,MatCheckboxModule, FormsModule],
  templateUrl:'./checkbox.component.html',
  styleUrl: './checkbox.component.css'
})
export class CheckboxComponent {
  @Input() data: any;
}
