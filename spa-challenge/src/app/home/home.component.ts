import { Component } from '@angular/core';
import { UserTableComponent } from '../user-table/user-table.component'
import { AddUserComponent } from '../add-user/add-user.component';

@Component({
  standalone: true,
  selector: 'spa-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  imports: [UserTableComponent, AddUserComponent]
})
export class HomeComponent {

}
