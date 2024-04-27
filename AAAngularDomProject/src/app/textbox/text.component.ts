// text.component.ts
import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';


@Component({
  selector: 'app-text',
  standalone: true,
  templateUrl: './text.component.html',
  imports: [FormsModule, MatFormFieldModule, MatInputModule],
  styleUrl: './text.component.css'
})
export class TextComponent {
  @Input() data: any;
}
