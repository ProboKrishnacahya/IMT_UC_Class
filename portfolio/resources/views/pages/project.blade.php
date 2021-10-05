@extends('layouts.app')

@section('content')
    <h1 class="display-4">{{ $title }}</h1>
    {{-- Menerima multi value dari Blade --}}
    @if (count($projects) > 0)
        {{-- Cek apakah ada min. 1 item --}}
        <ul>
            @foreach ($projects as $project)
                <li>{{ $projects }}</li>
            @endforeach
        </ul>
    @endif
@endsection
