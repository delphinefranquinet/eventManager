import { Component, OnInit } from '@angular/core';
import { HomeService } from '../../Services/home.service';
import { EventItem } from '../../Models/eventItem';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {


  public events: EventItem[];

  constructor( private eventsService: HomeService) { }

  ngOnInit() {
   this.eventsService.getEvents().subscribe(events => this.events = events);
  }

}
