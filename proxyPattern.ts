/* 
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. It is typically used when we want to add additional functionality to an object without changing the code of the original object. The proxy works as an intermediary between the client and the real object. It intercepts all the calls of the client and forwards them to the real object. It can also do additional work before and after forwarding the calls. The real object may not even know that a proxy is working on its behalf. The client should not know whether it is working with the real object or with the proxy.
*/

interface IYoutubeService {
  listVideos(): void;
  getVideoInfo(id: string): void;
  downloadVideo(id: string): void;
}

class YoutubeService implements IYoutubeService {
  listVideos(): void {
    console.log("Listing videos");
  }
  getVideoInfo(id: string): void {
    console.log("Getting video info");
  }
  downloadVideo(id: string): void {
    console.log("Downloading video");
  }
}

class YoutubeProxy implements IYoutubeService {
  private service: IYoutubeService;
  private cache: Map<string, any> = new Map();
  constructor(service: IYoutubeService) {
    this.service = service;
  }
  listVideos(): void {
    this.service.listVideos();
  }
  getVideoInfo(id: string): void {
    if (this.cache.has(id)) {
      console.log("Getting video info from cache");
      return;
    }
    this.cache.set(id, true);
    console.log("Getting video info from server");
    this.service.getVideoInfo(id);
  }
  downloadVideo(id: string): void {
    if (this.cache.has(id)) {
      console.log("Downloading video from cache");
      return;
    }

    console.log("Downloading video from server");
    this.cache.set(id, true);
    this.service.downloadVideo(id);
  }
}

// main

const youtubeProxy = new YoutubeProxy(new YoutubeService());
youtubeProxy.listVideos();
youtubeProxy.getVideoInfo("123");
youtubeProxy.downloadVideo("123");

/* 
Problem: 
Suppose we have an object that does some computation and returns a result. If the computation is expensive and the result doesn't change often, we might want to cache the result so that the computation is only done once. The Proxy pattern can be used to add this caching behavior to the object without changing the object itself.
*/

/*
Solution: 
The Proxy pattern provides a way to add behavior to an object without changing its structure. It is often used to add caching or logging behavior to objects. The proxy class will handle the request from client and then forward to the real object. The proxy can also do additional work before and after forwarding the request to the real object.
*/

/* 
Structure:

1. Service Interface: Defines interface of service. Proxy should implement this interface.

2. Service Class: Implements the service interface. Proxy should use this class to access the service. it has core business logic.

3. Proxy Class: has a reference to the service class. Proxy can access the service class through this reference. Proxy may also do additional work before and after forwarding the request to the real object.

4. Client Class: Client uses the Proxy class to access the service.
*/
