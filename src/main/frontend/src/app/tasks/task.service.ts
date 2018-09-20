import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
//import { Http } from '@angular/http';
//import 'rxjs/add/operator/map';


@Injectable()
export class TaskService {

    constructor(private http: HttpClient) {

    }

    getTasks() {
//        return this.http.get('/api/tasks').map(response => response.json());
//        elozo sor helyett, ez alapjan (https://www.udemy.com/angular-4-java-developers/learn/v4/questions/3235392):
        return this.http.get('/api/tasks');

    }
}