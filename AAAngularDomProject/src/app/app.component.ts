import { Component } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { TextComponent } from './textbox/text.component';
import { DropdownComponent } from './dropdown/dropdown.component';
import { CheckboxComponent } from './checkbox/checkbox.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { FormsModule } from '@angular/forms';
import { DataService } from './service/datamap.service';
import { HttpClientModule } from '@angular/common/http';
import {MatCardModule} from '@angular/material/card';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, TextComponent, DropdownComponent, CheckboxComponent, MatFormFieldModule, MatSelectModule, MatInputModule, MatButtonModule, MatIconModule,MatCardModule, FormsModule, HttpClientModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
  providers: [DataService]
})
export class AppComponent {
  constructor(private dataService: DataService) { }

  element = {
    textbox: 1,
    select: 1,
    checkbox: 1
  }
  initalElement = { ...this.element };

  jsonData = [
    {
      "id": "1",
      "type": "text",
      "value": "Hello world!"
    },
    {
      "id": "4",
      "type": "text",
      "value": "Hello world 2!"
    },
    {
      "id": "2",
      "type": "dropdown",
      "data": ["ICE", "WATER", "GAS"]
    },
    {
      "id": "3",
      "type": "checkbox",
      "data": [{
        "text": "isWater",
        "isChecked": false
      }, {
        "text": "isGas",
        "isChecked": true
      }]
    },

  ];

  ngOnInit() {
    
    this.fetchData();
  }



  addRemoveTextBox(flag: boolean): void {
    if (flag) {
      this.element.textbox++;
    } else {
      this.element.textbox === 0 ? null: this.element.textbox--;
    }
  };

  addRemoveCheckBox(flag: boolean): void {
    if (flag) {
      this.element.checkbox++;
    } else {
      this.element.checkbox === 0 ? null: this.element.checkbox--;
    }
  };
  addRemoveSelect(flag: boolean): void {
    if (flag) {
      this.element.select++;
    } else {
      this.element.select === 0 ? null: this.element.select--;
    }
  };

  reset():void{
    this.element = { ...this.initalElement };
  }


  fetchData(): void {


    this.dataService.getData(this.element).subscribe(
      response => {
        // Handle successful response
        this.jsonData = response;
        console.log('Response:', response);
      },
      error => {
        // Handle error
        console.error('Error:', error);
      }
    );
  }
}

