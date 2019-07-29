import { Injectable } from '@angular/core';
import { EventItem } from '../Models/eventItem';
import { Observable, throwError } from 'rxjs';
import { environment } from '../../environments/environment';
import { catchError } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class HomeService {

  constructor(private http: HttpClient) { }

  public getEvents(): Observable<EventItem[]> {
    return this.http
      .get<EventItem[]>(`${environment.baseUrl}/home`)
      .pipe(catchError((error: any) => throwError(error.error)));
  }
}
